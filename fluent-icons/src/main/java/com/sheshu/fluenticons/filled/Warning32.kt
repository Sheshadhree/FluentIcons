package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Warning32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Warning32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.064f, 3.809f)
            curveToRelative(-1.332f, -2.41f, -4.796f, -2.41f, -6.128f, 0f)
            lineTo(2.443f, 22.808f)
            curveTo(1.155f, 25.14f, 2.843f, 28f, 5.507f, 28f)
            horizontalLineToRelative(20.986f)
            curveToRelative(2.665f, 0f, 4.353f, -2.86f, 3.064f, -5.192f)
            lineToRelative(-10.493f, -19f)
            close()
            moveTo(17.25f, 22f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            reflectiveCurveToRelative(-1.25f, -0.56f, -1.25f, -1.25f)
            reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
            reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
            close()
            moveTo(16f, 9f)
            curveToRelative(0.553f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.552f, -0.447f, 1f, -1f, 1f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-8f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            close()
        }
    }.build()
}
