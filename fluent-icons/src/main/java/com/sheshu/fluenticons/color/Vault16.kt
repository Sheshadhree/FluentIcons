package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Vault16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Vault16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.005f to Color(0xFF88E06C),
                    1f to Color(0xFF0078D4)
                ),
                start = Offset(0.5625f, 2.16667f),
                end = Offset(6.17701f, 17.006f)
            )
        ) {
            moveTo(1f, 5.5f)
            curveTo(1f, 4.12f, 2.12f, 3f, 3.5f, 3f)
            horizontalLineToRelative(9f)
            curveTo(13.88f, 3f, 15f, 4.12f, 15f, 5.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-9f)
            curveTo(2.12f, 13f, 1f, 11.88f, 1f, 10.5f)
            verticalLineToRelative(-5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF4A43CB),
                    1f to Color(0x004A43CB)
                ),
                center = Offset(10.5f, 8.5f),
                radius = 3.20156f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(1f, 5.5f)
            curveTo(1f, 4.12f, 2.12f, 3f, 3.5f, 3f)
            horizontalLineToRelative(9f)
            curveTo(13.88f, 3f, 15f, 4.12f, 15f, 5.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-9f)
            curveTo(2.12f, 13f, 1f, 11.88f, 1f, 10.5f)
            verticalLineToRelative(-5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.024416f to Color(0xB24A43CB),
                    1f to Color(0x004A43CB)
                ),
                center = Offset(5f, 8.5f),
                radius = 3f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(1f, 5.5f)
            curveTo(1f, 4.12f, 2.12f, 3f, 3.5f, 3f)
            horizontalLineToRelative(9f)
            curveTo(13.88f, 3f, 15f, 4.12f, 15f, 5.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-9f)
            curveTo(2.12f, 13f, 1f, 11.88f, 1f, 10.5f)
            verticalLineToRelative(-5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0xFFB9C0C7)
                ),
                start = Offset(8.5f, 6.5f),
                end = Offset(18.0863f, 3.62313f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(11.354f, 8.647f)
            curveTo(11.448f, 8.45f, 11.5f, 8.232f, 11.5f, 8f)
            curveToRelative(0f, -0.232f, -0.053f, -0.45f, -0.146f, -0.647f)
            lineToRelative(0.5f, -0.5f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.511f, 0f, -0.707f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineToRelative(-0.5f, 0.5f)
            curveTo(10.452f, 6.553f, 10.233f, 6.5f, 10f, 6.5f)
            curveToRelative(-0.232f, 0f, -0.45f, 0.053f, -0.647f, 0.146f)
            lineToRelative(-0.5f, -0.5f)
            curveToRelative(-0.195f, -0.195f, -0.511f, -0.195f, -0.707f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(0.5f, 0.5f)
            curveTo(8.552f, 7.548f, 8.5f, 7.767f, 8.5f, 8f)
            curveToRelative(0f, 0.232f, 0.053f, 0.45f, 0.146f, 0.647f)
            lineToRelative(-0.5f, 0.5f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.707f, 0f)
            lineToRelative(0.5f, -0.5f)
            curveTo(9.55f, 9.448f, 9.768f, 9.5f, 10f, 9.5f)
            curveToRelative(0.232f, 0f, 0.45f, -0.053f, 0.647f, -0.146f)
            lineToRelative(0.5f, 0.5f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.707f)
            lineToRelative(-0.5f, -0.5f)
            close()
            moveTo(10f, 8.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(10.276f, 7.5f, 10f, 7.5f)
            reflectiveCurveTo(9.5f, 7.724f, 9.5f, 8f)
            reflectiveCurveTo(9.724f, 8.5f, 10f, 8.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0xFFB9C0C7)
                ),
                start = Offset(4.125f, 6.5f),
                end = Offset(6.72279f, 6.3051f)
            )
        ) {
            moveTo(4.5f, 6f)
            curveTo(4.224f, 6f, 4f, 6.224f, 4f, 6.5f)
            verticalLineToRelative(3f)
            curveTo(4f, 9.776f, 4.224f, 10f, 4.5f, 10f)
            reflectiveCurveTo(5f, 9.776f, 5f, 9.5f)
            verticalLineToRelative(-3f)
            curveTo(5f, 6.224f, 4.776f, 6f, 4.5f, 6f)
            close()
        }
    }.build()
}
