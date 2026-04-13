package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ShoppingBag24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShoppingBag24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 5f)
            verticalLineToRelative(2f)
            horizontalLineTo(5.5f)
            curveTo(4.672f, 7f, 4f, 7.672f, 4f, 8.5f)
            verticalLineTo(18f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            horizontalLineToRelative(6.01f)
            curveTo(13.38f, 21.259f, 13f, 20.299f, 13f, 19.25f)
            verticalLineTo(5f)
            curveToRelative(0f, -0.334f, -0.055f, -0.656f, -0.156f, -0.956f)
            curveTo(13.12f, 3.712f, 13.535f, 3.5f, 14f, 3.5f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(12.25f)
            curveToRelative(0f, 1.519f, 1.231f, 2.75f, 2.75f, 2.75f)
            reflectiveCurveTo(20f, 20.769f, 20f, 19.25f)
            verticalLineTo(8.5f)
            curveTo(20f, 7.672f, 19.328f, 7f, 18.5f, 7f)
            horizontalLineTo(17f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            curveToRelative(-0.768f, 0f, -1.47f, 0.289f, -2f, 0.764f)
            curveTo(11.47f, 2.289f, 10.768f, 2f, 10f, 2f)
            curveTo(8.343f, 2f, 7f, 3.343f, 7f, 5f)
            close()
            moveToRelative(1.5f, 0f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-3f)
            verticalLineTo(5f)
            close()
        }
    }.build()
}
