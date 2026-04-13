package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.City20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.City20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 2f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineTo(4f)
            lineToRelative(1f, 0.001f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineToRelative(2.553f)
            curveToRelative(-1.141f, 0.232f, -2f, 1.24f, -2f, 2.45f)
            verticalLineTo(18f)
            horizontalLineToRelative(-2f)
            verticalLineTo(8.004f)
            curveToRelative(0f, -1.104f, -0.895f, -2f, -2f, -2f)
            verticalLineTo(5.501f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(1f)
            verticalLineTo(2.5f)
            curveTo(10.5f, 2.224f, 10.724f, 2f, 11f, 2f)
            close()
            moveTo(8.644f, 7.239f)
            curveToRelative(-0.28f, -0.197f, -0.48f, -0.204f, -0.648f, -0.153f)
            curveTo(7.95f, 7.102f, 7.906f, 7.123f, 7.861f, 7.15f)
            lineTo(4.729f, 9.03f)
            curveTo(4.277f, 9.3f, 4f, 9.79f, 4f, 10.316f)
            verticalLineTo(16.5f)
            curveTo(4f, 17.328f, 4.672f, 18f, 5.5f, 18f)
            horizontalLineTo(9f)
            verticalLineTo(8.004f)
            curveTo(9f, 7.697f, 8.862f, 7.422f, 8.644f, 7.24f)
            close()
            moveTo(15.5f, 9f)
            verticalLineToRelative(0.004f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            verticalLineTo(18f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-6f)
            curveTo(18f, 9.672f, 17.328f, 9f, 16.5f, 9f)
            horizontalLineToRelative(-1f)
            close()
        }
    }.build()
}
