package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.FoodCarrot20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FoodCarrot20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.854f, 2.854f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            lineTo(14f, 5.292f)
            verticalLineTo(2.5f)
            curveTo(14f, 2.224f, 13.776f, 2f, 13.5f, 2f)
            reflectiveCurveTo(13f, 2.224f, 13f, 2.5f)
            verticalLineToRelative(2.877f)
            curveToRelative(-1.579f, -0.786f, -3.59f, -0.34f, -4.64f, 1.206f)
            lineToRelative(-6.087f, 8.946f)
            curveTo(1.845f, 16.16f, 1.927f, 17f, 2.47f, 17.536f)
            curveToRelative(0.55f, 0.544f, 1.416f, 0.619f, 2.053f, 0.178f)
            lineToRelative(8.93f, -6.184f)
            curveToRelative(1.512f, -1.047f, 1.943f, -2.992f, 1.176f, -4.53f)
            horizontalLineTo(17.5f)
            curveTo(17.776f, 7f, 18f, 6.776f, 18f, 6.5f)
            reflectiveCurveTo(17.776f, 6f, 17.5f, 6f)
            horizontalLineToRelative(-2.793f)
            lineToRelative(3.146f, -3.146f)
            close()
            moveToRelative(-8.66f, 4.284f)
            curveToRelative(0.922f, -1.355f, 2.865f, -1.541f, 4.032f, -0.386f)
            curveToRelative(1.154f, 1.142f, 0.986f, 3.037f, -0.35f, 3.963f)
            lineToRelative(-8.93f, 6.184f)
            curveToRelative(-0.238f, 0.164f, -0.56f, 0.136f, -0.766f, -0.066f)
            curveToRelative(-0.202f, -0.2f, -0.232f, -0.514f, -0.073f, -0.748f)
            lineToRelative(6.087f, -8.947f)
            close()
        }
    }.build()
}
