package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowUndo16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowUndo16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 2.75f)
            curveTo(3f, 2.336f, 3.336f, 2f, 3.75f, 2f)
            reflectiveCurveTo(4.5f, 2.336f, 4.5f, 2.75f)
            verticalLineToRelative(3.095f)
            lineToRelative(2.673f, -2.673f)
            curveToRelative(1.562f, -1.563f, 4.095f, -1.563f, 5.657f, 0f)
            curveToRelative(1.562f, 1.562f, 1.562f, 4.094f, 0f, 5.656f)
            lineToRelative(-4.95f, 4.95f)
            curveToRelative(-0.293f, 0.293f, -0.768f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.294f, -0.293f, -0.294f, -0.767f, 0f, -1.06f)
            lineToRelative(4.95f, -4.95f)
            curveToRelative(0.976f, -0.976f, 0.976f, -2.56f, 0f, -3.536f)
            curveToRelative(-0.977f, -0.976f, -2.56f, -0.976f, -3.536f, 0f)
            lineTo(5.966f, 6.5f)
            horizontalLineTo(8.25f)
            curveTo(8.664f, 6.5f, 9f, 6.836f, 9f, 7.25f)
            reflectiveCurveTo(8.664f, 8f, 8.25f, 8f)
            horizontalLineToRelative(-4.4f)
            curveTo(3.38f, 8f, 3f, 7.62f, 3f, 7.15f)
            verticalLineToRelative(-4.4f)
            close()
        }
    }.build()
}
