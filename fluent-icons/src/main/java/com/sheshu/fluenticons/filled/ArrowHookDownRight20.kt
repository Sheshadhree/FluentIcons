package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowHookDownRight20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowHookDownRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 14f)
            curveToRelative(0.06f, 0f, -0.06f, 0.002f, 0f, 0f)
            curveToRelative(0.023f, 0.002f, 0.226f, 0f, 0.25f, 0f)
            horizontalLineToRelative(4.393f)
            lineToRelative(-2.268f, 2.268f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.768f, 0f, 1.06f)
            curveToRelative(0.293f, 0.294f, 0.768f, 0.294f, 1.061f, 0f)
            lineToRelative(3.353f, -3.352f)
            curveToRelative(0.174f, -0.174f, 0.245f, -0.413f, 0.212f, -0.639f)
            curveToRelative(-0.019f, -0.162f, -0.09f, -0.32f, -0.215f, -0.444f)
            lineTo(12.54f, 9.646f)
            curveToRelative(-0.293f, -0.293f, -0.768f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.768f, 0f, 1.061f)
            lineToRelative(1.79f, 1.793f)
            horizontalLineTo(9f)
            curveToRelative(-1.933f, 0f, -3.5f, -1.567f, -3.5f, -3.5f)
            reflectiveCurveTo(7.067f, 5.5f, 9f, 5.5f)
            horizontalLineToRelative(4.25f)
            curveTo(13.664f, 5.5f, 14f, 5.164f, 14f, 4.75f)
            reflectiveCurveTo(13.664f, 4f, 13.25f, 4f)
            horizontalLineTo(9f)
            curveTo(6.239f, 4f, 4f, 6.239f, 4f, 9f)
            reflectiveCurveToRelative(2.239f, 5f, 5f, 5f)
            close()
        }
    }.build()
}
