package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextPositionLine24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextPositionLine24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.75f, 4f)
            curveTo(3.336f, 4f, 3f, 4.336f, 3f, 4.75f)
            reflectiveCurveTo(3.336f, 5.5f, 3.75f, 5.5f)
            horizontalLineToRelative(16.5f)
            curveTo(20.664f, 5.5f, 21f, 5.164f, 21f, 4.75f)
            reflectiveCurveTo(20.664f, 4f, 20.25f, 4f)
            horizontalLineTo(3.75f)
            close()
            moveTo(7f, 8.5f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(4.75f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(3f, 16.164f, 3f, 15.75f)
            verticalLineTo(11f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            verticalLineToRelative(4.75f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(9.5f, 16.164f, 9.5f, 15.75f)
            verticalLineTo(11f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            close()
            moveToRelative(6.75f, 6f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(13.336f, 16f, 13.75f, 16f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-6.5f)
            close()
            moveToRelative(-10f, 3.5f)
            curveTo(3.336f, 18f, 3f, 18.336f, 3f, 18.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(16.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(20.664f, 18f, 20.25f, 18f)
            horizontalLineTo(3.75f)
            close()
        }
    }.build()
}
