package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Open32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Open32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.75f, 5.5f)
            curveTo(6.507f, 5.5f, 5.5f, 6.507f, 5.5f, 7.75f)
            verticalLineToRelative(16.5f)
            curveToRelative(0f, 1.243f, 1.007f, 2.25f, 2.25f, 2.25f)
            horizontalLineToRelative(16.5f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            reflectiveCurveTo(29f, 18.56f, 29f, 19.25f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 2.623f, -2.127f, 4.75f, -4.75f, 4.75f)
            horizontalLineTo(7.75f)
            curveTo(5.127f, 29f, 3f, 26.873f, 3f, 24.25f)
            verticalLineTo(7.75f)
            curveTo(3f, 5.127f, 5.127f, 3f, 7.75f, 3f)
            horizontalLineToRelative(5f)
            curveTo(13.44f, 3f, 14f, 3.56f, 14f, 4.25f)
            reflectiveCurveTo(13.44f, 5.5f, 12.75f, 5.5f)
            horizontalLineToRelative(-5f)
            close()
            moveTo(18f, 4.25f)
            curveTo(18f, 3.56f, 18.56f, 3f, 19.25f, 3f)
            horizontalLineToRelative(8.5f)
            curveTo(28.44f, 3f, 29f, 3.56f, 29f, 4.25f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            reflectiveCurveToRelative(-1.25f, -0.56f, -1.25f, -1.25f)
            verticalLineTo(7.268f)
            lineToRelative(-6.366f, 6.366f)
            curveToRelative(-0.488f, 0.488f, -1.28f, 0.488f, -1.768f, 0f)
            reflectiveCurveToRelative(-0.488f, -1.28f, 0f, -1.768f)
            lineTo(24.732f, 5.5f)
            horizontalLineTo(19.25f)
            curveTo(18.56f, 5.5f, 18f, 4.94f, 18f, 4.25f)
            close()
        }
    }.build()
}
