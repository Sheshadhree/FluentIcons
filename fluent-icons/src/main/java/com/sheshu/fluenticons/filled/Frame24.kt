package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Frame24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Frame24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.25f, 2f)
            curveTo(5.664f, 2f, 6f, 2.336f, 6f, 2.75f)
            verticalLineTo(4.5f)
            horizontalLineToRelative(12f)
            verticalLineTo(2.75f)
            curveTo(18f, 2.336f, 18.336f, 2f, 18.75f, 2f)
            reflectiveCurveToRelative(0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineTo(4.5f)
            horizontalLineToRelative(1.75f)
            curveTo(21.664f, 4.5f, 22f, 4.836f, 22f, 5.25f)
            reflectiveCurveTo(21.664f, 6f, 21.25f, 6f)
            horizontalLineTo(19.5f)
            verticalLineToRelative(12f)
            horizontalLineToRelative(1.75f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(19.5f)
            verticalLineToRelative(1.75f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(18f, 21.664f, 18f, 21.25f)
            verticalLineTo(19.5f)
            horizontalLineTo(6f)
            verticalLineToRelative(1.75f)
            curveTo(6f, 21.664f, 5.664f, 22f, 5.25f, 22f)
            reflectiveCurveTo(4.5f, 21.664f, 4.5f, 21.25f)
            verticalLineTo(19.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 19.5f, 2f, 19.164f, 2f, 18.75f)
            reflectiveCurveTo(2.336f, 18f, 2.75f, 18f)
            horizontalLineTo(4.5f)
            verticalLineTo(6f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 6f, 2f, 5.664f, 2f, 5.25f)
            reflectiveCurveTo(2.336f, 4.5f, 2.75f, 4.5f)
            horizontalLineTo(4.5f)
            verticalLineTo(2.75f)
            curveTo(4.5f, 2.336f, 4.836f, 2f, 5.25f, 2f)
            close()
        }
    }.build()
}
