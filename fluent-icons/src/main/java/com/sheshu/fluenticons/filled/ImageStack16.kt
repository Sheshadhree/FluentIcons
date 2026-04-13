package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ImageStack16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ImageStack16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineTo(7f)
            horizontalLineToRelative(2.793f)
            lineToRelative(1.97f, -1.97f)
            curveToRelative(0.683f, -0.683f, 1.791f, -0.683f, 2.474f, 0f)
            lineTo(11.207f, 7f)
            horizontalLineTo(14f)
            verticalLineTo(4.5f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-7f)
            close()
            moveTo(14f, 8f)
            horizontalLineTo(2f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 1.04f, 0.635f, 1.931f, 1.538f, 2.308f)
            curveToRelative(0.025f, -0.059f, 0.06f, -0.114f, 0.109f, -0.162f)
            lineToRelative(3.116f, -3.116f)
            curveToRelative(0.683f, -0.683f, 1.791f, -0.683f, 2.474f, 0f)
            lineToRelative(3.117f, 3.116f)
            curveToRelative(0.047f, 0.048f, 0.084f, 0.103f, 0.108f, 0.162f)
            curveTo(13.365f, 13.431f, 14f, 12.54f, 14f, 11.5f)
            verticalLineTo(8f)
            close()
            moveTo(6.207f, 7f)
            horizontalLineToRelative(3.586f)
            lineTo(8.53f, 5.737f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineTo(6.207f, 7f)
            close()
            moveToRelative(5.086f, 7f)
            horizontalLineTo(4.707f)
            lineToRelative(2.763f, -2.763f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineTo(11.293f, 14f)
            close()
            moveTo(12.5f, 9.75f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(11f, 10.164f, 11f, 9.75f)
            reflectiveCurveTo(11.336f, 9f, 11.75f, 9f)
            reflectiveCurveToRelative(0.75f, 0.336f, 0.75f, 0.75f)
            close()
            moveTo(11.75f, 5f)
            curveTo(11.336f, 5f, 11f, 4.664f, 11f, 4.25f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            reflectiveCurveToRelative(0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(12.164f, 5f, 11.75f, 5f)
            close()
        }
    }.build()
}
