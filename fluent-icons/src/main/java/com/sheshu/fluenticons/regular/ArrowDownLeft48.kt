package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowDownLeft48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowDownLeft48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(25.75f, 42f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineTo(10.268f)
            lineTo(41.634f, 8.134f)
            curveToRelative(0.488f, -0.488f, 0.488f, -1.28f, 0f, -1.768f)
            reflectiveCurveToRelative(-1.28f, -0.488f, -1.768f, 0f)
            lineTo(8.5f, 37.732f)
            verticalLineTo(22.25f)
            curveTo(8.5f, 21.56f, 7.94f, 21f, 7.25f, 21f)
            reflectiveCurveTo(6f, 21.56f, 6f, 22.25f)
            verticalLineToRelative(18.5f)
            curveTo(6f, 41.44f, 6.56f, 42f, 7.25f, 42f)
            horizontalLineToRelative(18.5f)
            close()
        }
    }.build()
}
