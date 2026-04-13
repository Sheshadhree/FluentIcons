package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextDescriptionLtr20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextDescriptionLtr20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.75f, 4.5f)
            curveTo(2.336f, 4.5f, 2f, 4.836f, 2f, 5.25f)
            reflectiveCurveTo(2.336f, 6f, 2.75f, 6f)
            horizontalLineToRelative(14.5f)
            curveTo(17.664f, 6f, 18f, 5.664f, 18f, 5.25f)
            reflectiveCurveTo(17.664f, 4.5f, 17.25f, 4.5f)
            horizontalLineTo(2.75f)
            close()
            moveToRelative(0f, 3f)
            curveTo(2.336f, 7.5f, 2f, 7.836f, 2f, 8.25f)
            reflectiveCurveTo(2.336f, 9f, 2.75f, 9f)
            horizontalLineToRelative(14.5f)
            curveTo(17.664f, 9f, 18f, 8.664f, 18f, 8.25f)
            reflectiveCurveTo(17.664f, 7.5f, 17.25f, 7.5f)
            horizontalLineTo(2.75f)
            close()
            moveTo(2f, 11.25f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(14.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(17.664f, 12f, 17.25f, 12f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 12f, 2f, 11.664f, 2f, 11.25f)
            close()
            moveToRelative(0.75f, 2.25f)
            curveTo(2.336f, 13.5f, 2f, 13.836f, 2f, 14.25f)
            reflectiveCurveTo(2.336f, 15f, 2.75f, 15f)
            horizontalLineToRelative(9.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-9.5f)
            close()
        }
    }.build()
}
