package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PresenceUnknown20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PresenceUnknown20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.997f, 2f)
            curveTo(5.581f, 2f, 2f, 5.58f, 2f, 9.997f)
            reflectiveCurveToRelative(3.58f, 7.998f, 7.997f, 7.998f)
            reflectiveCurveToRelative(7.998f, -3.58f, 7.998f, -7.998f)
            curveTo(17.995f, 5.581f, 14.415f, 2f, 9.997f, 2f)
            close()
            moveTo(0f, 9.997f)
            curveTo(0f, 4.476f, 4.476f, 0f, 9.997f, 0f)
            curveToRelative(5.522f, 0f, 9.998f, 4.476f, 9.998f, 9.997f)
            curveToRelative(0f, 5.522f, -4.476f, 9.998f, -9.998f, 9.998f)
            curveTo(4.476f, 19.995f, 0f, 15.519f, 0f, 9.997f)
            close()
        }
    }.build()
}
