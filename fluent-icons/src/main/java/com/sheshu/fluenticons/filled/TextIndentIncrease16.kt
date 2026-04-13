package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextIndentIncrease16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextIndentIncrease16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.75f, 3f)
            curveTo(5.336f, 3f, 5f, 3.336f, 5f, 3.75f)
            reflectiveCurveTo(5.336f, 4.5f, 5.75f, 4.5f)
            horizontalLineToRelative(5.5f)
            curveTo(11.664f, 4.5f, 12f, 4.164f, 12f, 3.75f)
            reflectiveCurveTo(11.664f, 3f, 11.25f, 3f)
            horizontalLineToRelative(-5.5f)
            close()
            moveToRelative(0f, 4f)
            curveTo(5.336f, 7f, 5f, 7.336f, 5f, 7.75f)
            reflectiveCurveTo(5.336f, 8.5f, 5.75f, 8.5f)
            horizontalLineToRelative(8.5f)
            curveTo(14.664f, 8.5f, 15f, 8.164f, 15f, 7.75f)
            reflectiveCurveTo(14.664f, 7f, 14.25f, 7f)
            horizontalLineToRelative(-8.5f)
            close()
            moveToRelative(0f, 4f)
            curveTo(5.336f, 11f, 5f, 11.336f, 5f, 11.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(9.664f, 11f, 9.25f, 11f)
            horizontalLineToRelative(-3.5f)
            close()
            moveTo(2.28f, 5.72f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(0.97f, 0.97f)
            lineToRelative(-0.97f, 0.97f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(1.5f, -1.5f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(-1.5f, -1.5f)
            close()
        }
    }.build()
}
