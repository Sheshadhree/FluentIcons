package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Cloud24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Cloud24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 5.5f)
            curveToRelative(-2.413f, 0f, -4.383f, 1.9f, -4.495f, 4.285f)
            curveToRelative(-0.019f, 0.4f, -0.349f, 0.715f, -0.75f, 0.715f)
            horizontalLineTo(6.5f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(11f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
            horizontalLineToRelative(-0.256f)
            curveToRelative(-0.4f, 0f, -0.73f, -0.315f, -0.749f, -0.715f)
            curveTo(16.383f, 7.4f, 14.413f, 5.5f, 12f, 5.5f)
            close()
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
