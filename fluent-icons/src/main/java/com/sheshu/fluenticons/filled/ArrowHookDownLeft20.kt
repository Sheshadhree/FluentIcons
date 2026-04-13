package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowHookDownLeft20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowHookDownLeft20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 4.75f)
            curveTo(6f, 4.336f, 6.336f, 4f, 6.75f, 4f)
            horizontalLineToRelative(4.5f)
            curveToRelative(1.586f, 0f, 2.696f, 0.621f, 3.53f, 1.588f)
            curveTo(15.6f, 6.54f, 16f, 7.784f, 16f, 9f)
            curveToRelative(0f, 1.216f, -0.3f, 2.46f, -1.12f, 3.412f)
            curveTo(14.046f, 13.379f, 12.836f, 14f, 11.25f, 14f)
            horizontalLineTo(6.56f)
            lineToRelative(2.22f, 2.22f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            lineToRelative(-3.5f, -3.5f)
            curveTo(4.076f, 13.636f, 3.996f, 13.44f, 4f, 13.236f)
            curveToRelative(0.004f, -0.204f, 0.09f, -0.397f, 0.24f, -0.536f)
            lineToRelative(3.5f, -3.25f)
            curveTo(8.043f, 9.17f, 8.518f, 9.186f, 8.8f, 9.49f)
            curveToRelative(0.281f, 0.303f, 0.264f, 0.778f, -0.04f, 1.06f)
            lineToRelative(-2.1f, 1.95f)
            horizontalLineToRelative(4.59f)
            curveToRelative(1.164f, 0f, 1.86f, -0.441f, 2.4f, -1.068f)
            curveTo(14.204f, 10.79f, 14.5f, 9.909f, 14.5f, 9f)
            reflectiveCurveToRelative(-0.296f, -1.79f, -0.85f, -2.432f)
            curveTo(13.11f, 5.941f, 12.414f, 5.5f, 11.25f, 5.5f)
            horizontalLineToRelative(-4.5f)
            curveTo(6.336f, 5.5f, 6f, 5.164f, 6f, 4.75f)
            close()
        }
    }.build()
}
