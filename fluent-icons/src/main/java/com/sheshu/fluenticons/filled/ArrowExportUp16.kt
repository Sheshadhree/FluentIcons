package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowExportUp16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowExportUp16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 14.25f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(8.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(12.664f, 15f, 12.25f, 15f)
            horizontalLineToRelative(-8.5f)
            curveTo(3.336f, 15f, 3f, 14.664f, 3f, 14.25f)
            close()
            moveToRelative(0.97f, -9.53f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(2.22f, -2.22f)
            verticalLineToRelative(7.69f)
            curveTo(7.25f, 11.664f, 7.586f, 12f, 8f, 12f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(3.56f)
            lineToRelative(2.22f, 2.22f)
            curveToRelative(0.293f, 0.293f, 0.768f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(-3.5f, -3.5f)
            curveToRelative(-0.292f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineToRelative(-3.5f, 3.5f)
            close()
        }
    }.build()
}
