package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.ArrowDown32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.ArrowDown32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.5f, 3.5f)
            curveTo(16.5f, 3.224f, 16.276f, 3f, 16f, 3f)
            reflectiveCurveToRelative(-0.5f, 0.224f, -0.5f, 0.5f)
            verticalLineToRelative(23.833f)
            lineToRelative(-9.655f, -9.195f)
            curveToRelative(-0.2f, -0.19f, -0.517f, -0.183f, -0.707f, 0.017f)
            curveToRelative(-0.19f, 0.2f, -0.183f, 0.517f, 0.017f, 0.707f)
            lineToRelative(10.5f, 10f)
            curveToRelative(0.193f, 0.184f, 0.497f, 0.184f, 0.69f, 0f)
            lineToRelative(10.5f, -10f)
            curveToRelative(0.2f, -0.19f, 0.207f, -0.507f, 0.017f, -0.707f)
            curveToRelative(-0.19f, -0.2f, -0.507f, -0.207f, -0.707f, -0.017f)
            lineTo(16.5f, 27.333f)
            verticalLineTo(3.5f)
            close()
        }
    }.build()
}
