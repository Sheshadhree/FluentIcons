package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextWrap20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextWrap20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 4.25f)
            curveTo(2f, 3.836f, 2.336f, 3.5f, 2.75f, 3.5f)
            horizontalLineToRelative(14.5f)
            curveTo(17.664f, 3.5f, 18f, 3.836f, 18f, 4.25f)
            reflectiveCurveTo(17.664f, 5f, 17.25f, 5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 5f, 2f, 4.664f, 2f, 4.25f)
            close()
            moveToRelative(0f, 5f)
            curveTo(2f, 8.836f, 2.336f, 8.5f, 2.75f, 8.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.795f, 0f, 3.25f, 1.455f, 3.25f, 3.25f)
            reflectiveCurveTo(17.545f, 15f, 15.75f, 15f)
            horizontalLineToRelative(-3.399f)
            lineToRelative(0.225f, 0.27f)
            curveToRelative(0.265f, 0.318f, 0.222f, 0.791f, -0.096f, 1.056f)
            reflectiveCurveToRelative(-0.791f, 0.222f, -1.056f, -0.096f)
            lineToRelative(-1.25f, -1.5f)
            curveToRelative(-0.232f, -0.278f, -0.232f, -0.682f, 0f, -0.96f)
            lineToRelative(1.25f, -1.5f)
            curveToRelative(0.265f, -0.318f, 0.738f, -0.361f, 1.056f, -0.096f)
            curveToRelative(0.318f, 0.265f, 0.361f, 0.738f, 0.096f, 1.056f)
            lineToRelative(-0.225f, 0.27f)
            horizontalLineToRelative(3.399f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            reflectiveCurveTo(16.716f, 10f, 15.75f, 10f)
            horizontalLineToRelative(-13f)
            curveTo(2.336f, 10f, 2f, 9.664f, 2f, 9.25f)
            close()
            moveToRelative(0f, 5f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(4.5f)
            curveTo(7.664f, 13.5f, 8f, 13.836f, 8f, 14.25f)
            reflectiveCurveTo(7.664f, 15f, 7.25f, 15f)
            horizontalLineToRelative(-4.5f)
            curveTo(2.336f, 15f, 2f, 14.664f, 2f, 14.25f)
            close()
        }
    }.build()
}
