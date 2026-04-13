package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextPositionTopBottom24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextPositionTopBottom24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 4.75f)
            curveTo(3f, 4.336f, 3.336f, 4f, 3.75f, 4f)
            horizontalLineToRelative(16.5f)
            curveTo(20.664f, 4f, 21f, 4.336f, 21f, 4.75f)
            reflectiveCurveTo(20.664f, 5.5f, 20.25f, 5.5f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 5.5f, 3f, 5.164f, 3f, 4.75f)
            close()
            moveToRelative(0f, 14f)
            curveTo(3f, 18.336f, 3.336f, 18f, 3.75f, 18f)
            horizontalLineToRelative(16.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 19.5f, 3f, 19.164f, 3f, 18.75f)
            close()
            moveTo(9.5f, 11f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(4.75f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(16f, 16.164f, 16f, 15.75f)
            verticalLineTo(11f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
            verticalLineToRelative(4.75f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(11f)
            close()
        }
    }.build()
}
