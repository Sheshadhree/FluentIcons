package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Cloud24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Cloud24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.08f, 9.02f)
            curveTo(6.548f, 6.171f, 9.02f, 4f, 12f, 4f)
            reflectiveCurveToRelative(5.452f, 2.172f, 5.92f, 5.02f)
            curveTo(20.208f, 9.23f, 22f, 11.155f, 22f, 13.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-11f)
            curveTo(4.015f, 18f, 2f, 15.985f, 2f, 13.5f)
            curveToRelative(0f, -2.344f, 1.792f, -4.269f, 4.08f, -4.48f)
            close()
        }
    }.build()
}
