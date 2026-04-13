package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextColumnOneWide24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextColumnOneWide24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.75f, 5f)
            curveTo(3.336f, 5f, 3f, 5.336f, 3f, 5.75f)
            reflectiveCurveTo(3.336f, 6.5f, 3.75f, 6.5f)
            horizontalLineToRelative(16.5f)
            curveTo(20.664f, 6.5f, 21f, 6.164f, 21f, 5.75f)
            reflectiveCurveTo(20.664f, 5f, 20.25f, 5f)
            horizontalLineTo(3.75f)
            close()
            moveToRelative(0f, 4f)
            curveTo(3.336f, 9f, 3f, 9.336f, 3f, 9.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(16.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(20.664f, 9f, 20.25f, 9f)
            horizontalLineTo(3.75f)
            close()
            moveTo(3f, 13.75f)
            curveTo(3f, 13.336f, 3.336f, 13f, 3.75f, 13f)
            horizontalLineToRelative(16.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 14.5f, 3f, 14.164f, 3f, 13.75f)
            close()
            moveTo(3.75f, 17f)
            curveTo(3.336f, 17f, 3f, 17.336f, 3f, 17.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(16.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(20.664f, 17f, 20.25f, 17f)
            horizontalLineTo(3.75f)
            close()
        }
    }.build()
}
