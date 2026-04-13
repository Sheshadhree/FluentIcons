package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FolderMultiple16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FolderMultiple16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.146f, 2.44f)
            lineTo(7f, 3.292f)
            lineToRelative(-1.56f, 1.56f)
            curveTo(5.345f, 4.948f, 5.217f, 5f, 5.085f, 5f)
            horizontalLineTo(1f)
            verticalLineTo(4.5f)
            curveTo(1f, 3.12f, 2.12f, 2f, 3.5f, 2f)
            horizontalLineToRelative(1.586f)
            curveToRelative(0.398f, 0f, 0.78f, 0.158f, 1.06f, 0.44f)
            close()
            moveTo(1f, 9.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(4.086f)
            curveToRelative(0.398f, 0f, 0.78f, -0.158f, 1.06f, -0.44f)
            lineTo(8.207f, 3.5f)
            horizontalLineTo(10.5f)
            curveTo(11.88f, 3.5f, 13f, 4.62f, 13f, 6f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-7f)
            curveTo(2.12f, 12f, 1f, 10.88f, 1f, 9.5f)
            close()
            moveTo(14f, 6f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(0.456f, 0.607f, 1.182f, 1f, 2f, 1f)
            horizontalLineToRelative(5f)
            curveToRelative(2.486f, 0f, 4.5f, -2.014f, 4.5f, -4.5f)
            verticalLineTo(8f)
            curveToRelative(0f, -0.818f, -0.393f, -1.544f, -1f, -2f)
            close()
        }
    }.build()
}
