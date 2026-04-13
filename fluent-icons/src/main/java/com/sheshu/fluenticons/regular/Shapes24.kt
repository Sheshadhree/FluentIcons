package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Shapes24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Shapes24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.75f, 3.5f)
            curveToRelative(-2.9f, 0f, -5.25f, 2.35f, -5.25f, 5.25f)
            curveToRelative(0f, 2.645f, 1.956f, 4.833f, 4.5f, 5.197f)
            verticalLineToRelative(1.512f)
            curveToRelative(-3.375f, -0.373f, -6f, -3.235f, -6f, -6.709f)
            curveTo(2f, 5.022f, 5.022f, 2f, 8.75f, 2f)
            curveToRelative(3.474f, 0f, 6.336f, 2.625f, 6.709f, 6f)
            horizontalLineToRelative(-1.512f)
            curveToRelative(-0.364f, -2.544f, -2.552f, -4.5f, -5.197f, -4.5f)
            close()
            moveToRelative(3.5f, 5.5f)
            curveTo(10.455f, 9f, 9f, 10.455f, 9f, 12.25f)
            verticalLineToRelative(6.5f)
            curveTo(9f, 20.545f, 10.455f, 22f, 12.25f, 22f)
            horizontalLineToRelative(6.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineToRelative(-6.5f)
            curveTo(22f, 10.455f, 20.545f, 9f, 18.75f, 9f)
            horizontalLineToRelative(-6.5f)
            close()
            moveToRelative(-1.75f, 3.25f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-6.5f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.784f, -1.75f, -1.75f)
            verticalLineToRelative(-6.5f)
            close()
        }
    }.build()
}
