package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonRibbon16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonRibbon16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 12.645f)
            verticalLineToRelative(1.044f)
            curveTo(9.41f, 13.887f, 8.74f, 14f, 8f, 14f)
            curveToRelative(-3.14f, 0f, -5f, -2.029f, -5f, -4f)
            verticalLineTo(9.5f)
            curveTo(3f, 8.672f, 3.672f, 8f, 4.5f, 8f)
            horizontalLineToRelative(5.035f)
            curveTo(9.195f, 8.588f, 9f, 9.271f, 9f, 10f)
            curveToRelative(0f, 1.014f, 0.378f, 1.94f, 1f, 2.645f)
            close()
            moveTo(8f, 1.5f)
            curveToRelative(1.519f, 0f, 2.75f, 1.231f, 2.75f, 2.75f)
            reflectiveCurveTo(9.519f, 7f, 8f, 7f)
            reflectiveCurveTo(5.25f, 5.769f, 5.25f, 4.25f)
            reflectiveCurveTo(6.481f, 1.5f, 8f, 1.5f)
            close()
            moveTo(13f, 13f)
            curveToRelative(1.657f, 0f, 3f, -1.344f, 3f, -3f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            reflectiveCurveToRelative(-3f, 1.343f, -3f, 3f)
            curveToRelative(0f, 1.656f, 1.343f, 3f, 3f, 3f)
            close()
            moveToRelative(0f, 1f)
            curveToRelative(0.729f, 0f, 1.412f, -0.196f, 2f, -0.536f)
            verticalLineToRelative(2.285f)
            curveToRelative(0f, 0.194f, -0.211f, 0.314f, -0.378f, 0.215f)
            lineTo(13f, 15f)
            lineToRelative(-1.622f, 0.965f)
            curveTo(11.21f, 16.064f, 11f, 15.944f, 11f, 15.75f)
            verticalLineToRelative(-2.285f)
            curveTo(11.588f, 13.805f, 12.271f, 14f, 13f, 14f)
            close()
        }
    }.build()
}
