package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableBottomRow24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableBottomRow24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineToRelative(8.25f)
            horizontalLineToRelative(1.5f)
            verticalLineTo(6.25f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            horizontalLineToRelative(11.5f)
            curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            verticalLineToRelative(8.25f)
            horizontalLineTo(21f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(4.5f, 20.49f)
            curveToRelative(-0.7f, -0.449f, -1.216f, -1.158f, -1.413f, -1.99f)
            curveTo(3.03f, 18.26f, 3f, 18.008f, 3f, 17.75f)
            verticalLineTo(16f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(5f)
            horizontalLineTo(6.25f)
            curveToRelative(-0.644f, 0f, -1.245f, -0.188f, -1.75f, -0.51f)
            close()
            moveToRelative(16.413f, -1.99f)
            curveTo(20.97f, 18.26f, 21f, 18.008f, 21f, 17.75f)
            verticalLineTo(16f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(1.75f)
            curveToRelative(0.644f, 0f, 1.245f, -0.188f, 1.75f, -0.51f)
            curveToRelative(0.7f, -0.449f, 1.216f, -1.158f, 1.413f, -1.99f)
            close()
            moveTo(14.5f, 21f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(5f)
            close()
        }
    }.build()
}
