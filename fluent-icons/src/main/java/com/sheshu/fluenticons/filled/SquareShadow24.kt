package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SquareShadow24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SquareShadow24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.75f, 2f)
            curveTo(15.545f, 2f, 17f, 3.455f, 17f, 5.25f)
            verticalLineTo(7f)
            horizontalLineToRelative(1.75f)
            curveTo(20.545f, 7f, 22f, 8.455f, 22f, 10.25f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            horizontalLineToRelative(-8f)
            curveTo(8.455f, 22f, 7f, 20.545f, 7f, 18.75f)
            verticalLineTo(17f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 17f, 2f, 15.545f, 2f, 13.75f)
            verticalLineToRelative(-8.5f)
            curveTo(2f, 3.455f, 3.455f, 2f, 5.25f, 2f)
            horizontalLineToRelative(8.5f)
            close()
            moveToRelative(-8.5f, 2f)
            curveTo(4.56f, 4f, 4f, 4.56f, 4f, 5.25f)
            verticalLineToRelative(8.5f)
            curveTo(4f, 14.44f, 4.56f, 15f, 5.25f, 15f)
            horizontalLineToRelative(8.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineToRelative(-8.5f)
            curveTo(15f, 4.56f, 14.44f, 4f, 13.75f, 4f)
            horizontalLineToRelative(-8.5f)
            close()
        }
    }.build()
}
