package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Bot28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Bot28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 1.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineTo(3f)
            horizontalLineToRelative(4.5f)
            curveTo(20.769f, 3f, 22f, 4.231f, 22f, 5.75f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineTo(8.75f)
            curveTo(7.231f, 14f, 6f, 12.769f, 6f, 11.25f)
            verticalLineToRelative(-5.5f)
            curveTo(6f, 4.231f, 7.231f, 3f, 8.75f, 3f)
            horizontalLineToRelative(4.5f)
            verticalLineTo(2.25f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            close()
            moveTo(6.75f, 16f)
            curveTo(5.231f, 16f, 4f, 17.231f, 4f, 18.75f)
            verticalLineToRelative(0.75f)
            curveToRelative(0f, 1.977f, 0.961f, 3.642f, 2.717f, 4.78f)
            curveTo(8.444f, 25.397f, 10.917f, 26f, 14f, 26f)
            curveToRelative(3.084f, 0f, 5.556f, -0.602f, 7.283f, -1.72f)
            curveTo(23.039f, 23.141f, 24f, 21.476f, 24f, 19.5f)
            verticalLineToRelative(-0.75f)
            curveToRelative(0f, -1.519f, -1.231f, -2.75f, -2.75f, -2.75f)
            horizontalLineTo(6.75f)
            close()
            moveTo(11f, 10f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(11.828f, 7f, 11f, 7f)
            reflectiveCurveTo(9.5f, 7.672f, 9.5f, 8.5f)
            reflectiveCurveTo(10.172f, 10f, 11f, 10f)
            close()
            moveToRelative(7.5f, -1.5f)
            curveTo(18.5f, 7.672f, 17.828f, 7f, 17f, 7f)
            reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
            reflectiveCurveTo(16.172f, 10f, 17f, 10f)
            reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
            close()
        }
    }.build()
}
