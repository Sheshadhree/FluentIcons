package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BookLetter20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BookLetter20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 2f)
            curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(9.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(15.776f, 17f, 15.5f, 17f)
            horizontalLineTo(6f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            horizontalLineToRelative(10f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(6f)
            close()
            moveToRelative(4f, 3f)
            curveToRelative(0.2f, 0f, 0.38f, 0.12f, 0.46f, 0.303f)
            lineToRelative(3f, 7f)
            curveToRelative(0.108f, 0.254f, -0.01f, 0.548f, -0.263f, 0.657f)
            curveToRelative(-0.254f, 0.108f, -0.548f, -0.01f, -0.657f, -0.263f)
            lineTo(11.813f, 11f)
            horizontalLineTo(8.187f)
            lineTo(7.46f, 12.697f)
            curveToRelative(-0.11f, 0.254f, -0.403f, 0.371f, -0.657f, 0.263f)
            curveToRelative(-0.254f, -0.11f, -0.371f, -0.403f, -0.263f, -0.657f)
            lineToRelative(3f, -7f)
            curveTo(9.62f, 5.119f, 9.8f, 5f, 10f, 5f)
            close()
            moveToRelative(-1.385f, 5f)
            horizontalLineToRelative(2.77f)
            lineTo(10f, 6.77f)
            lineTo(8.615f, 10f)
            close()
        }
    }.build()
}
