package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DoorArrowRight32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DoorArrowRight32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.5f, 16f)
            curveToRelative(4.142f, 0f, 7.5f, 3.358f, 7.5f, 7.5f)
            curveToRelative(0f, 4.142f, -3.358f, 7.5f, -7.5f, 7.5f)
            curveToRelative(-4.142f, 0f, -7.5f, -3.358f, -7.5f, -7.5f)
            curveToRelative(0f, -4.142f, 3.358f, -7.5f, 7.5f, -7.5f)
            close()
            moveToRelative(0.25f, -14f)
            curveTo(25.545f, 2f, 27f, 3.455f, 27f, 5.25f)
            verticalLineToRelative(9.955f)
            curveToRelative(-1.076f, -0.454f, -2.259f, -0.705f, -3.5f, -0.705f)
            curveToRelative(-4.97f, 0f, -9f, 4.03f, -9f, 9f)
            curveToRelative(0f, 2.556f, 1.067f, 4.862f, 2.778f, 6.5f)
            horizontalLineTo(8.25f)
            curveToRelative(-1.739f, 0f, -3.16f, -1.366f, -3.246f, -3.083f)
            lineTo(5f, 26.75f)
            verticalLineTo(5.25f)
            curveTo(5f, 3.455f, 6.455f, 2f, 8.25f, 2f)
            horizontalLineToRelative(15.5f)
            close()
            moveToRelative(1.03f, 16.72f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(2.72f, 2.72f)
            horizontalLineToRelative(-7.69f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(18.336f, 24f, 18.75f, 24f)
            horizontalLineToRelative(7.69f)
            lineToRelative(-2.72f, 2.72f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(4f, -4f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(-4f, -4f)
            close()
            moveTo(10.5f, 13.75f)
            curveToRelative(-0.966f, 0f, -1.75f, 0.784f, -1.75f, 1.75f)
            reflectiveCurveToRelative(0.784f, 1.75f, 1.75f, 1.75f)
            reflectiveCurveToRelative(1.75f, -0.784f, 1.75f, -1.75f)
            reflectiveCurveToRelative(-0.784f, -1.75f, -1.75f, -1.75f)
            close()
        }
    }.build()
}
