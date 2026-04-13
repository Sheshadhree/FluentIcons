package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PresenceUnknown10: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PresenceUnknown10",
        defaultWidth = 10.dp,
        defaultHeight = 10.dp,
        viewportWidth = 10f,
        viewportHeight = 10f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.999f, 1f)
            curveTo(2.79f, 1f, 1f, 2.79f, 1f, 4.999f)
            curveToRelative(0f, 2.208f, 1.79f, 3.998f, 3.999f, 3.998f)
            curveToRelative(2.208f, 0f, 3.998f, -1.79f, 3.998f, -3.998f)
            curveTo(8.997f, 2.79f, 7.207f, 1f, 5f, 1f)
            close()
            moveTo(0f, 4.999f)
            curveTo(0f, 2.238f, 2.238f, 0f, 4.999f, 0f)
            curveToRelative(2.76f, 0f, 4.998f, 2.238f, 4.998f, 4.999f)
            curveToRelative(0f, 2.76f, -2.238f, 4.998f, -4.998f, 4.998f)
            curveTo(2.238f, 9.997f, 0f, 7.76f, 0f, 5f)
            close()
        }
    }.build()
}
