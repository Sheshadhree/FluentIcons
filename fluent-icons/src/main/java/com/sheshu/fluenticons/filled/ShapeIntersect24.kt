package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ShapeIntersect24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShapeIntersect24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 5.25f)
            curveTo(2f, 3.455f, 3.455f, 2f, 5.25f, 2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.795f, 0f, 3.25f, 1.455f, 3.25f, 3.25f)
            verticalLineTo(7.5f)
            horizontalLineToRelative(2.25f)
            curveToRelative(1.795f, 0f, 3.25f, 1.455f, 3.25f, 3.25f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-8f)
            curveToRelative(-1.795f, 0f, -3.25f, -1.455f, -3.25f, -3.25f)
            verticalLineTo(16.5f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 16.5f, 2f, 15.045f, 2f, 13.25f)
            verticalLineToRelative(-8f)
            close()
            moveToRelative(13f, 0f)
            curveToRelative(0f, -0.966f, -0.784f, -1.75f, -1.75f, -1.75f)
            horizontalLineToRelative(-8f)
            curveTo(4.284f, 3.5f, 3.5f, 4.284f, 3.5f, 5.25f)
            verticalLineToRelative(8f)
            curveTo(3.5f, 14.216f, 4.284f, 15f, 5.25f, 15f)
            horizontalLineTo(7.5f)
            verticalLineToRelative(-4.25f)
            curveToRelative(0f, -0.637f, 0.183f, -1.231f, 0.5f, -1.733f)
            curveToRelative(0.241f, -0.381f, 0.56f, -0.71f, 0.933f, -0.962f)
            lineTo(9.017f, 8f)
            curveToRelative(0.502f, -0.317f, 1.096f, -0.5f, 1.733f, -0.5f)
            horizontalLineTo(15f)
            verticalLineTo(5.25f)
            close()
            moveToRelative(1f, 9.733f)
            lineToRelative(-0.055f, 0.084f)
            curveToRelative(-0.252f, 0.374f, -0.58f, 0.692f, -0.962f, 0.933f)
            curveToRelative(-0.502f, 0.317f, -1.096f, 0.5f, -1.733f, 0.5f)
            horizontalLineTo(9f)
            verticalLineToRelative(2.25f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(8f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-8f)
            curveTo(20.5f, 9.784f, 19.716f, 9f, 18.75f, 9f)
            horizontalLineTo(16.5f)
            verticalLineToRelative(4.25f)
            curveToRelative(0f, 0.637f, -0.183f, 1.231f, -0.5f, 1.733f)
            close()
        }
    }.build()
}
