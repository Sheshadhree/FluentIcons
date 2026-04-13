package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Archive28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Archive28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 4.5f)
            curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
            horizontalLineToRelative(19f)
            curveTo(24.328f, 3f, 25f, 3.672f, 25f, 4.5f)
            verticalLineToRelative(2f)
            curveTo(25f, 7.328f, 24.328f, 8f, 23.5f, 8f)
            horizontalLineToRelative(-19f)
            curveTo(3.672f, 8f, 3f, 7.328f, 3f, 6.5f)
            verticalLineToRelative(-2f)
            close()
            moveToRelative(1f, 5f)
            horizontalLineToRelative(20f)
            verticalLineToRelative(10.75f)
            curveToRelative(0f, 2.623f, -2.127f, 4.75f, -4.75f, 4.75f)
            horizontalLineTo(8.75f)
            curveTo(6.127f, 25f, 4f, 22.873f, 4f, 20.25f)
            verticalLineTo(9.5f)
            close()
            moveToRelative(7.75f, 3f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(11.336f, 14f, 11.75f, 14f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-4.5f)
            close()
        }
    }.build()
}
