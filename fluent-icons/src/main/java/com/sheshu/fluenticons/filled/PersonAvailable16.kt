package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonAvailable16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonAvailable16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.889f, 5.24f)
            curveTo(7.85f, 5.557f, 6.943f, 6.174f, 6.266f, 6.99f)
            curveTo(4.996f, 6.87f, 4f, 5.801f, 4f, 4.5f)
            curveTo(4f, 3.12f, 5.12f, 2f, 6.5f, 2f)
            reflectiveCurveTo(9f, 3.12f, 9f, 4.5f)
            curveToRelative(0f, 0.258f, -0.039f, 0.506f, -0.111f, 0.74f)
            close()
            moveTo(3.5f, 8f)
            horizontalLineToRelative(2.1f)
            curveTo(5.216f, 8.75f, 5f, 9.6f, 5f, 10.5f)
            curveToRelative(0f, 1.309f, 0.457f, 2.51f, 1.22f, 3.455f)
            curveTo(3.554f, 13.64f, 2f, 11.73f, 2f, 10f)
            verticalLineTo(9.75f)
            curveTo(2f, 8.955f, 2.672f, 8f, 3.5f, 8f)
            close()
            moveTo(15f, 10.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(6f, 12.985f, 6f, 10.5f)
            reflectiveCurveTo(8.015f, 6f, 10.5f, 6f)
            reflectiveCurveTo(15f, 8.015f, 15f, 10.5f)
            close()
            moveToRelative(-2.146f, -1.854f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineTo(9.5f, 11.293f)
            lineToRelative(-0.646f, -0.647f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.708f)
            lineToRelative(1f, 1f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            lineToRelative(3f, -3f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.707f)
            close()
        }
    }.build()
}
