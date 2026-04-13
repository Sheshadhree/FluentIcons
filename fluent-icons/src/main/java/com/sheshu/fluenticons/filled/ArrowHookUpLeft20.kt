package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowHookUpLeft20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowHookUpLeft20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 15.25f)
            curveTo(6f, 15.664f, 6.336f, 16f, 6.75f, 16f)
            horizontalLineToRelative(4.5f)
            curveToRelative(1.586f, 0f, 2.696f, -0.621f, 3.53f, -1.588f)
            curveTo(15.6f, 13.46f, 16f, 12.216f, 16f, 11f)
            curveToRelative(0f, -1.216f, -0.3f, -2.46f, -1.12f, -3.412f)
            curveTo(14.046f, 6.621f, 12.836f, 6f, 11.25f, 6f)
            horizontalLineTo(6.56f)
            lineToRelative(2.22f, -2.22f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineToRelative(-3.5f, 3.5f)
            curveTo(4.076f, 6.364f, 3.996f, 6.56f, 4f, 6.764f)
            curveTo(4.004f, 6.968f, 4.09f, 7.16f, 4.24f, 7.3f)
            lineToRelative(3.5f, 3.25f)
            curveToRelative(0.303f, 0.281f, 0.778f, 0.264f, 1.06f, -0.04f)
            curveToRelative(0.281f, -0.303f, 0.264f, -0.778f, -0.04f, -1.06f)
            lineTo(6.66f, 7.5f)
            horizontalLineToRelative(4.59f)
            curveToRelative(1.164f, 0f, 1.86f, 0.441f, 2.4f, 1.068f)
            curveTo(14.204f, 9.21f, 14.5f, 10.091f, 14.5f, 11f)
            reflectiveCurveToRelative(-0.296f, 1.79f, -0.85f, 2.432f)
            curveToRelative(-0.54f, 0.627f, -1.236f, 1.068f, -2.4f, 1.068f)
            horizontalLineToRelative(-4.5f)
            curveTo(6.336f, 14.5f, 6f, 14.836f, 6f, 15.25f)
            close()
        }
    }.build()
}
