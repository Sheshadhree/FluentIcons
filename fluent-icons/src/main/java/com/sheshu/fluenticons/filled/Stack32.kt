package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Stack32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Stack32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 7f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(14f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(5f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineTo(7f)
            close()
            moveToRelative(8.17f, 19f)
            curveToRelative(0.412f, 1.165f, 1.523f, 2f, 2.83f, 2f)
            horizontalLineToRelative(6f)
            curveToRelative(6.074f, 0f, 11f, -4.925f, 11f, -11f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -1.306f, -0.836f, -2.418f, -2f, -2.83f)
            verticalLineTo(17f)
            curveToRelative(0f, 4.97f, -4.03f, 9f, -9f, 9f)
            horizontalLineToRelative(-8.83f)
            close()
            moveTo(9f, 24f)
            curveToRelative(-1.307f, 0f, -2.418f, -0.835f, -2.83f, -2f)
            horizontalLineTo(19f)
            curveToRelative(2.76f, 0f, 5f, -2.239f, 5f, -5f)
            verticalLineTo(8.17f)
            curveToRelative(1.164f, 0.412f, 2f, 1.524f, 2f, 2.83f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 3.866f, -3.135f, 7f, -7f, 7f)
            horizontalLineTo(9f)
            close()
        }
    }.build()
}
