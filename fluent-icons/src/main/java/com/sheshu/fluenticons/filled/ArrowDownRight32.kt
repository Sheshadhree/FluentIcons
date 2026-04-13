package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowDownRight32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowDownRight32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.25f, 29f)
            curveTo(14.56f, 29f, 14f, 28.44f, 14f, 27.75f)
            reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
            horizontalLineToRelative(9.482f)
            lineTo(3.366f, 5.134f)
            curveToRelative(-0.488f, -0.488f, -0.488f, -1.28f, 0f, -1.768f)
            reflectiveCurveToRelative(1.28f, -0.488f, 1.768f, 0f)
            lineTo(26.5f, 24.732f)
            verticalLineTo(15.25f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            reflectiveCurveTo(29f, 14.56f, 29f, 15.25f)
            verticalLineToRelative(12.5f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineToRelative(-12.5f)
            close()
        }
    }.build()
}
