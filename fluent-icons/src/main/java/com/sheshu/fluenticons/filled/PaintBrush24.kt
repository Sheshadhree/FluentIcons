package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PaintBrush24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PaintBrush24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.5f, 2f)
            verticalLineToRelative(3.252f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(14f, 5.665f, 14f, 5.252f)
            verticalLineTo(2f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(4.251f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(2f)
            horizontalLineToRelative(1.75f)
            curveTo(18.665f, 2f, 19f, 2.336f, 19f, 2.75f)
            verticalLineTo(11f)
            horizontalLineTo(5f)
            verticalLineTo(2.75f)
            curveTo(5f, 2.336f, 5.336f, 2f, 5.75f, 2f)
            horizontalLineToRelative(6.75f)
            close()
            moveTo(5f, 12.5f)
            verticalLineToRelative(1.752f)
            curveToRelative(0f, 1.243f, 1.008f, 2.25f, 2.25f, 2.25f)
            horizontalLineTo(10f)
            verticalLineTo(20f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            curveToRelative(1.104f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-3.498f)
            horizontalLineToRelative(2.75f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineTo(12.5f)
            horizontalLineTo(5f)
            close()
        }
    }.build()
}
