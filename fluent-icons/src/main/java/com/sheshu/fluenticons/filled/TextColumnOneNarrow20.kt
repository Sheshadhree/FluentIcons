package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextColumnOneNarrow20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextColumnOneNarrow20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.75f, 5f)
            curveTo(7.336f, 5f, 7f, 5.336f, 7f, 5.75f)
            reflectiveCurveTo(7.336f, 6.5f, 7.75f, 6.5f)
            horizontalLineToRelative(4.5f)
            curveTo(12.664f, 6.5f, 13f, 6.164f, 13f, 5.75f)
            reflectiveCurveTo(12.664f, 5f, 12.25f, 5f)
            horizontalLineToRelative(-4.5f)
            close()
            moveToRelative(0f, 3f)
            curveTo(7.336f, 8f, 7f, 8.336f, 7f, 8.75f)
            reflectiveCurveTo(7.336f, 9.5f, 7.75f, 9.5f)
            horizontalLineToRelative(4.5f)
            curveTo(12.664f, 9.5f, 13f, 9.164f, 13f, 8.75f)
            reflectiveCurveTo(12.664f, 8f, 12.25f, 8f)
            horizontalLineToRelative(-4.5f)
            close()
            moveTo(7f, 11.75f)
            curveTo(7f, 11.336f, 7.336f, 11f, 7.75f, 11f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-4.5f)
            curveTo(7.336f, 12.5f, 7f, 12.164f, 7f, 11.75f)
            close()
            moveTo(7.75f, 14f)
            curveTo(7.336f, 14f, 7f, 14.336f, 7f, 14.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(12.664f, 14f, 12.25f, 14f)
            horizontalLineToRelative(-4.5f)
            close()
        }
    }.build()
}
