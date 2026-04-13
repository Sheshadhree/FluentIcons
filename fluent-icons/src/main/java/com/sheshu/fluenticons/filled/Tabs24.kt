package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Tabs24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Tabs24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 9.25f)
            curveTo(2f, 5.246f, 5.246f, 2f, 9.25f, 2f)
            horizontalLineToRelative(3.5f)
            curveToRelative(1.352f, 0f, 2.511f, 0.825f, 3f, 2f)
            horizontalLineToRelative(-5.5f)
            curveTo(6.798f, 4f, 4f, 6.798f, 4f, 10.25f)
            verticalLineToRelative(5.5f)
            curveToRelative(-1.175f, -0.49f, -2f, -1.648f, -2f, -3f)
            verticalLineToRelative(-3.5f)
            close()
            moveToRelative(3f, 1f)
            curveTo(5f, 7.35f, 7.35f, 5f, 10.25f, 5f)
            horizontalLineToRelative(5.5f)
            curveToRelative(1.352f, 0f, 2.511f, 0.825f, 3f, 2f)
            horizontalLineToRelative(-7.5f)
            curveTo(8.903f, 7f, 7f, 8.903f, 7f, 11.25f)
            verticalLineToRelative(7.5f)
            curveToRelative(-1.175f, -0.49f, -2f, -1.648f, -2f, -3f)
            verticalLineToRelative(-5.5f)
            close()
            moveTo(11.25f, 8f)
            curveTo(9.455f, 8f, 8f, 9.455f, 8f, 11.25f)
            verticalLineToRelative(7.5f)
            curveTo(8f, 20.545f, 9.455f, 22f, 11.25f, 22f)
            horizontalLineToRelative(7.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineToRelative(-7.5f)
            curveTo(22f, 9.455f, 20.545f, 8f, 18.75f, 8f)
            horizontalLineToRelative(-7.5f)
            close()
        }
    }.build()
}
