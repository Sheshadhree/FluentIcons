package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextDescriptionRtl20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextDescriptionRtl20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.25f, 4.5f)
            curveTo(17.664f, 4.5f, 18f, 4.836f, 18f, 5.25f)
            reflectiveCurveTo(17.664f, 6f, 17.25f, 6f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 6f, 2f, 5.664f, 2f, 5.25f)
            reflectiveCurveTo(2.336f, 4.5f, 2.75f, 4.5f)
            horizontalLineToRelative(14.5f)
            close()
            moveToRelative(0f, 3f)
            curveTo(17.664f, 7.5f, 18f, 7.836f, 18f, 8.25f)
            reflectiveCurveTo(17.664f, 9f, 17.25f, 9f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 9f, 2f, 8.664f, 2f, 8.25f)
            reflectiveCurveTo(2.336f, 7.5f, 2.75f, 7.5f)
            horizontalLineToRelative(14.5f)
            close()
            moveTo(18f, 11.25f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 10.5f, 2f, 10.836f, 2f, 11.25f)
            reflectiveCurveTo(2.336f, 12f, 2.75f, 12f)
            horizontalLineToRelative(14.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            close()
            moveToRelative(-0.75f, 2.25f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(17.664f, 15f, 17.25f, 15f)
            horizontalLineToRelative(-9.5f)
            curveTo(7.336f, 15f, 7f, 14.664f, 7f, 14.25f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(9.5f)
            close()
        }
    }.build()
}
