package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.NotebookSection24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.NotebookSection24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.648f, 2.007f)
            lineTo(15.75f, 2f)
            curveToRelative(0.38f, 0f, 0.694f, 0.282f, 0.743f, 0.648f)
            lineTo(16.5f, 2.75f)
            verticalLineToRelative(18.5f)
            curveToRelative(0f, 0.415f, -0.336f, 0.75f, -0.75f, 0.75f)
            curveToRelative(-0.38f, 0f, -0.694f, -0.282f, -0.743f, -0.648f)
            lineTo(15f, 21.25f)
            verticalLineToRelative(-1.254f)
            horizontalLineTo(9.25f)
            curveToRelative(-1.243f, 0f, -2.25f, -1.007f, -2.25f, -2.25f)
            verticalLineTo(6.25f)
            curveTo(7f, 5.007f, 8.007f, 4f, 9.25f, 4f)
            lineTo(15f, 3.999f)
            verticalLineTo(2.75f)
            curveToRelative(0f, -0.38f, 0.282f, -0.693f, 0.648f, -0.743f)
            lineTo(15.75f, 2f)
            lineToRelative(-0.102f, 0.007f)
            close()
            moveTo(15f, 5.5f)
            horizontalLineTo(9.25f)
            curveTo(8.836f, 5.5f, 8.5f, 5.836f, 8.5f, 6.25f)
            verticalLineToRelative(11.496f)
            curveToRelative(0f, 0.415f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineTo(15f)
            verticalLineTo(5.5f)
            close()
        }
    }.build()
}
