package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ImageShadow24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ImageShadow24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.25f, 2f)
            curveTo(3.455f, 2f, 2f, 3.455f, 2f, 5.25f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.641f, 0.186f, 1.24f, 0.506f, 1.743f)
            lineToRelative(5.701f, -5.37f)
            curveToRelative(0.867f, -0.816f, 2.22f, -0.816f, 3.086f, 0f)
            lineToRelative(5.7f, 5.37f)
            curveToRelative(0.321f, -0.504f, 0.507f, -1.102f, 0.507f, -1.743f)
            verticalLineToRelative(-9f)
            curveTo(17.5f, 3.455f, 16.045f, 2f, 14.25f, 2f)
            horizontalLineToRelative(-9f)
            close()
            moveToRelative(7.5f, 6f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
            reflectiveCurveTo(14f, 6.06f, 14f, 6.75f)
            reflectiveCurveTo(13.44f, 8f, 12.75f, 8f)
            close()
            moveToRelative(-7.5f, 9.5f)
            curveToRelative(-0.61f, 0f, -1.18f, -0.168f, -1.668f, -0.46f)
            lineToRelative(5.654f, -5.325f)
            curveToRelative(0.289f, -0.272f, 0.74f, -0.272f, 1.028f, 0f)
            lineToRelative(5.654f, 5.325f)
            curveToRelative(-0.488f, 0.292f, -1.058f, 0.46f, -1.668f, 0.46f)
            horizontalLineToRelative(-9f)
            close()
            moveToRelative(1.249f, 1.25f)
            verticalLineTo(18.5f)
            horizontalLineTo(14.5f)
            curveToRelative(0.08f, 0f, 0.16f, -0.002f, 0.238f, -0.007f)
            curveToRelative(2.099f, -0.123f, 3.763f, -1.864f, 3.763f, -3.993f)
            verticalLineToRelative(-8f)
            horizontalLineToRelative(0.248f)
            curveToRelative(1.795f, 0f, 3.25f, 1.455f, 3.25f, 3.25f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 2.9f, -2.35f, 5.25f, -5.25f, 5.25f)
            horizontalLineToRelative(-7f)
            curveToRelative(-1.795f, 0f, -3.25f, -1.455f, -3.25f, -3.25f)
            close()
        }
    }.build()
}
