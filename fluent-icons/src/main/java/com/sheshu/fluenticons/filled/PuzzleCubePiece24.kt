package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PuzzleCubePiece24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PuzzleCubePiece24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(17f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            close()
            moveToRelative(6.5f, 0f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(4f)
            close()
            moveToRelative(5.5f, -3.25f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(15f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(0.75f)
            close()
            moveTo(7f, 15.5f)
            horizontalLineTo(3f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(5f)
            close()
            moveToRelative(6.5f, 0f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(5f)
            close()
            moveToRelative(5.5f, 0f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(5f)
            close()
            moveTo(7f, 9f)
            horizontalLineTo(3f)
            verticalLineTo(8.25f)
            curveTo(3f, 6.455f, 4.455f, 5f, 6.25f, 5f)
            horizontalLineTo(7f)
            verticalLineToRelative(4f)
            close()
            moveToRelative(6.5f, 0f)
            horizontalLineToRelative(-5f)
            verticalLineTo(5f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(4f)
            close()
            moveToRelative(5.115f, -7.384f)
            curveToRelative(0.488f, -0.488f, 1.28f, -0.488f, 1.768f, 0f)
            lineToRelative(2f, 2f)
            curveToRelative(0.488f, 0.487f, 0.488f, 1.279f, 0f, 1.767f)
            lineToRelative(-2f, 1.998f)
            curveToRelative(-0.487f, 0.488f, -1.28f, 0.489f, -1.768f, 0f)
            lineToRelative(-1.999f, -1.998f)
            curveToRelative(-0.488f, -0.488f, -0.488f, -1.28f, 0f, -1.768f)
            lineToRelative(2f, -1.999f)
            close()
        }
    }.build()
}
