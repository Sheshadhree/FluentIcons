package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowDownLeft28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowDownLeft28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24.78f, 3.22f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            lineTo(5.56f, 23.5f)
            horizontalLineToRelative(9.69f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(15.664f, 25f, 15.25f, 25f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 25f, 3f, 24.664f, 3f, 24.25f)
            verticalLineToRelative(-11.5f)
            curveTo(3f, 12.336f, 3.336f, 12f, 3.75f, 12f)
            reflectiveCurveToRelative(0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(9.69f)
            lineTo(23.72f, 3.22f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            close()
        }
    }.build()
}
