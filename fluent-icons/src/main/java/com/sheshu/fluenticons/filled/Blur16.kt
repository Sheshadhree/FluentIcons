package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Blur16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Blur16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 2f)
            curveTo(4.686f, 2f, 2f, 4.686f, 2f, 8f)
            reflectiveCurveToRelative(2.686f, 6f, 6f, 6f)
            curveToRelative(1.777f, 0f, 3.374f, -0.773f, 4.472f, -2f)
            horizontalLineTo(8f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(5.197f)
            curveToRelative(0.183f, -0.316f, 0.338f, -0.65f, 0.462f, -1f)
            horizontalLineTo(8f)
            verticalLineTo(9f)
            horizontalLineToRelative(5.917f)
            curveTo(13.972f, 8.675f, 14f, 8.34f, 14f, 8f)
            horizontalLineTo(8f)
            verticalLineTo(7f)
            horizontalLineToRelative(5.917f)
            curveToRelative(-0.058f, -0.344f, -0.145f, -0.678f, -0.258f, -1f)
            horizontalLineTo(8f)
            verticalLineTo(5f)
            horizontalLineToRelative(5.197f)
            curveToRelative(-0.207f, -0.358f, -0.45f, -0.693f, -0.725f, -1f)
            horizontalLineTo(8f)
            verticalLineTo(3f)
            horizontalLineToRelative(3.318f)
            curveTo(10.368f, 2.368f, 9.227f, 2f, 8f, 2f)
            close()
        }
    }.build()
}
