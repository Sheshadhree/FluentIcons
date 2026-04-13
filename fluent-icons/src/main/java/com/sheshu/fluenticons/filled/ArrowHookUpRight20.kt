package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowHookUpRight20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowHookUpRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 6f)
            curveToRelative(0.06f, 0f, -0.06f, -0.002f, 0f, 0f)
            curveToRelative(0.023f, -0.002f, 0.226f, 0f, 0.25f, 0f)
            horizontalLineToRelative(4.393f)
            lineToRelative(-2.268f, -2.268f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.768f, 0f, -1.06f)
            curveToRelative(0.293f, -0.294f, 0.768f, -0.294f, 1.061f, 0f)
            lineToRelative(3.353f, 3.352f)
            curveToRelative(0.174f, 0.174f, 0.245f, 0.413f, 0.212f, 0.639f)
            curveToRelative(-0.019f, 0.162f, -0.09f, 0.32f, -0.215f, 0.443f)
            lineToRelative(-3.247f, 3.248f)
            curveToRelative(-0.293f, 0.293f, -0.768f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.768f, 0f, -1.061f)
            lineTo(13.27f, 7.5f)
            horizontalLineTo(9f)
            curveToRelative(-1.933f, 0f, -3.5f, 1.567f, -3.5f, 3.5f)
            reflectiveCurveToRelative(1.567f, 3.5f, 3.5f, 3.5f)
            horizontalLineToRelative(4.25f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(13.664f, 16f, 13.25f, 16f)
            horizontalLineTo(9f)
            curveToRelative(-2.761f, 0f, -5f, -2.239f, -5f, -5f)
            reflectiveCurveToRelative(2.239f, -5f, 5f, -5f)
            close()
        }
    }.build()
}
