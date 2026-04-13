package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ImageMultiple24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ImageMultiple24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(9f)
            curveToRelative(1.795f, 0f, 3.25f, 1.455f, 3.25f, 3.25f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.646f, -0.189f, 1.248f, -0.514f, 1.755f)
            lineToRelative(-5.692f, -5.376f)
            curveToRelative(-0.867f, -0.819f, -2.223f, -0.819f, -3.09f, 0f)
            lineToRelative(-5.69f, 5.375f)
            curveTo(3.187f, 16.498f, 3f, 15.896f, 3f, 15.25f)
            verticalLineToRelative(-9f)
            close()
            moveToRelative(10.747f, 2.746f)
            curveToRelative(0.69f, 0f, 1.248f, -0.559f, 1.248f, -1.248f)
            curveToRelative(0f, -0.69f, -0.558f, -1.248f, -1.248f, -1.248f)
            reflectiveCurveTo(12.5f, 7.059f, 12.5f, 7.748f)
            curveToRelative(0f, 0.69f, 0.559f, 1.248f, 1.248f, 1.248f)
            close()
            moveToRelative(-2.483f, 3.724f)
            lineToRelative(5.642f, 5.327f)
            curveTo(16.42f, 18.335f, 15.855f, 18.5f, 15.25f, 18.5f)
            horizontalLineToRelative(-9f)
            curveToRelative(-0.605f, 0f, -1.171f, -0.165f, -1.657f, -0.453f)
            lineToRelative(5.641f, -5.327f)
            curveToRelative(0.29f, -0.273f, 0.741f, -0.273f, 1.03f, 0f)
            close()
            moveTo(8.75f, 21f)
            curveToRelative(-1.15f, 0f, -2.162f, -0.598f, -2.74f, -1.5f)
            horizontalLineToRelative(9.74f)
            curveToRelative(2.071f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineTo(6.011f)
            curveTo(20.402f, 6.589f, 21f, 7.6f, 21f, 8.751f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 2.899f, -2.35f, 5.25f, -5.25f, 5.25f)
            horizontalLineToRelative(-7f)
            close()
        }
    }.build()
}
