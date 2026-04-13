package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowDownLeft32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowDownLeft32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.75f, 29f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineTo(7.268f)
            lineTo(28.634f, 5.134f)
            curveToRelative(0.488f, -0.488f, 0.488f, -1.28f, 0f, -1.768f)
            reflectiveCurveToRelative(-1.28f, -0.488f, -1.768f, 0f)
            lineTo(5.5f, 24.732f)
            verticalLineTo(15.25f)
            curveTo(5.5f, 14.56f, 4.94f, 14f, 4.25f, 14f)
            reflectiveCurveTo(3f, 14.56f, 3f, 15.25f)
            verticalLineToRelative(12.5f)
            curveTo(3f, 28.44f, 3.56f, 29f, 4.25f, 29f)
            horizontalLineToRelative(12.5f)
            close()
        }
    }.build()
}
