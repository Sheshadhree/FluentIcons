package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FoodCarrot20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FoodCarrot20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.853f, 2.854f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(-0.195f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            lineTo(14f, 5.292f)
            verticalLineTo(2.5f)
            curveTo(14f, 2.224f, 13.776f, 2f, 13.5f, 2f)
            reflectiveCurveTo(13f, 2.224f, 13f, 2.5f)
            verticalLineToRelative(2.877f)
            curveToRelative(-1.58f, -0.786f, -3.588f, -0.34f, -4.64f, 1.205f)
            lineToRelative(-6.086f, 8.946f)
            curveTo(1.846f, 16.16f, 1.928f, 17f, 2.47f, 17.536f)
            curveToRelative(0.55f, 0.544f, 1.415f, 0.619f, 2.052f, 0.178f)
            lineToRelative(8.93f, -6.184f)
            curveToRelative(1.513f, -1.047f, 1.944f, -2.992f, 1.177f, -4.53f)
            horizontalLineToRelative(2.87f)
            curveTo(17.777f, 7f, 18f, 6.776f, 18f, 6.5f)
            reflectiveCurveTo(17.777f, 6f, 17.5f, 6f)
            horizontalLineToRelative(-2.793f)
            lineToRelative(3.147f, -3.146f)
            close()
        }
    }.build()
}
