package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextColumnOneNarrow24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextColumnOneNarrow24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.75f, 5f)
            curveTo(8.336f, 5f, 8f, 5.336f, 8f, 5.75f)
            reflectiveCurveTo(8.336f, 6.5f, 8.75f, 6.5f)
            horizontalLineToRelative(6.5f)
            curveTo(15.664f, 6.5f, 16f, 6.164f, 16f, 5.75f)
            reflectiveCurveTo(15.664f, 5f, 15.25f, 5f)
            horizontalLineToRelative(-6.5f)
            close()
            moveToRelative(0f, 4f)
            curveTo(8.336f, 9f, 8f, 9.336f, 8f, 9.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(15.664f, 9f, 15.25f, 9f)
            horizontalLineToRelative(-6.5f)
            close()
            moveTo(8f, 13.75f)
            curveTo(8f, 13.336f, 8.336f, 13f, 8.75f, 13f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-6.5f)
            curveTo(8.336f, 14.5f, 8f, 14.164f, 8f, 13.75f)
            close()
            moveTo(8.75f, 17f)
            curveTo(8.336f, 17f, 8f, 17.336f, 8f, 17.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(15.664f, 17f, 15.25f, 17f)
            horizontalLineToRelative(-6.5f)
            close()
        }
    }.build()
}
