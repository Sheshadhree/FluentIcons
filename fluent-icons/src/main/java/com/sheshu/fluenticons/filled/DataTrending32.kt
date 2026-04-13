package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DataTrending32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DataTrending32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 4.25f)
            curveTo(5.5f, 3.56f, 4.94f, 3f, 4.25f, 3f)
            reflectiveCurveTo(3f, 3.56f, 3f, 4.25f)
            verticalLineToRelative(20.5f)
            curveTo(3f, 27.097f, 4.903f, 29f, 7.25f, 29f)
            horizontalLineToRelative(20.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineTo(7.25f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.784f, -1.75f, -1.75f)
            verticalLineTo(4.25f)
            close()
            moveTo(20.246f, 6.5f)
            curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
            reflectiveCurveTo(19.556f, 9f, 20.246f, 9f)
            horizontalLineToRelative(3.986f)
            lineTo(18.5f, 14.732f)
            lineToRelative(-3.116f, -3.116f)
            curveToRelative(-0.488f, -0.488f, -1.28f, -0.488f, -1.768f, 0f)
            lineToRelative(-6.25f, 6.25f)
            curveToRelative(-0.488f, 0.488f, -0.488f, 1.28f, 0f, 1.768f)
            reflectiveCurveToRelative(1.28f, 0.488f, 1.768f, 0f)
            lineToRelative(5.366f, -5.366f)
            lineToRelative(3.116f, 3.116f)
            curveToRelative(0.488f, 0.488f, 1.28f, 0.488f, 1.768f, 0f)
            lineToRelative(6.612f, -6.612f)
            verticalLineToRelative(3.978f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineToRelative(-7f)
            close()
        }
    }.build()
}
