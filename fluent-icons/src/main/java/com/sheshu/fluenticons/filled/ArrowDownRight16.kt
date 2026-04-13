package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowDownRight16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowDownRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 13.25f)
            curveTo(7f, 13.664f, 7.335f, 14f, 7.75f, 14f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-5.5f)
            curveTo(14f, 7.336f, 13.664f, 7f, 13.25f, 7f)
            curveToRelative(-0.415f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(3.69f)
            lineTo(3.28f, 2.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(9.22f, 9.22f)
            horizontalLineTo(7.75f)
            curveTo(7.335f, 12.5f, 7f, 12.836f, 7f, 13.25f)
            close()
        }
    }.build()
}
