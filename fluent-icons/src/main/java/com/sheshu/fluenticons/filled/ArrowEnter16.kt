package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowEnter16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowEnter16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.75f, 1.5f)
            curveTo(6.336f, 1.5f, 6f, 1.836f, 6f, 2.25f)
            reflectiveCurveTo(6.336f, 3f, 6.75f, 3f)
            horizontalLineToRelative(4.75f)
            curveTo(12.328f, 3f, 13f, 3.672f, 13f, 4.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 13f, 6f, 13.336f, 6f, 13.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(4.75f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(6.75f)
            close()
            moveToRelative(3.03f, 5.97f)
            lineToRelative(-2.5f, -2.5f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(1.22f, 1.22f)
            horizontalLineTo(1.75f)
            curveTo(1.336f, 7.25f, 1f, 7.586f, 1f, 8f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(5.69f)
            lineTo(6.22f, 9.97f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(2.5f, -2.5f)
            curveTo(9.921f, 8.39f, 10f, 8.2f, 10f, 8f)
            reflectiveCurveTo(9.921f, 7.61f, 9.78f, 7.47f)
            close()
        }
    }.build()
}
